package st.alr.mqttitude.support;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.List;
import java.util.Locale;

import st.alr.mqttitude.model.GeocodableLocation;
import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Message;

// AsyncTask encapsulating the reverse-geocoding API
public class ReverseGeocodingTask extends
		AsyncTask<GeocodableLocation, Void, Void> {

	Context mContext;
	Handler mHandler;
	public static final int GEOCODER_RESULT = 3452;
	public static final int GEOCODER_NORESULT = 3453;

	public ReverseGeocodingTask(Context context, Handler handler) {
		super();
		this.mContext = context;
		this.mHandler = handler;
	}

	@Override
	protected Void doInBackground(GeocodableLocation... params) {
		Geocoder geocoder = new Geocoder(this.mContext, Locale.getDefault());
		GeocodableLocation l = params[0];
		int r = GEOCODER_NORESULT;

		// Return right away if there is already geocoder information available
		if (l.getGeocoder() == null) {
			try {
				List<Address> addresses = geocoder.getFromLocation(l
						.getLocation().getLatitude(), l.getLocation()
						.getLongitude(), 1);
				if ((addresses != null) && (addresses.size() > 0)) {



					if (addresses.get(0) != null)
						l.setGeocoder(addresses.get(0).getAddressLine(0) + ", " + addresses.get(0).getLocality());
					else
						l.setGeocoder(null);

					r = GEOCODER_RESULT;
				}
			} catch (IOException e) {
				r = GEOCODER_NORESULT;
			}
		} else {
			r = GEOCODER_RESULT;
		}
        if(params.length == 1)
		    Message.obtain(this.mHandler, r, l).sendToTarget();

		return null;
	}

}
