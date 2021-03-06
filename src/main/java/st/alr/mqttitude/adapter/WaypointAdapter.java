package st.alr.mqttitude.adapter;

import java.util.ArrayList;
import st.alr.mqttitude.R;
import st.alr.mqttitude.db.Waypoint;
import android.content.Context;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class WaypointAdapter extends MultitypeAdapter {
    public WaypointAdapter(Context context, ArrayList<Waypoint> waypoints) {
        super(context);

        if(waypoints != null)
            for (Waypoint c : waypoints)
                addItem(c);

        notifyDataSetChanged();
    }
    public DelegateAdapter getItemDelegateAdapter() {
        return new ItemDelegateAdapter();
    }


    public static class WaypointHolder {
        TextView description;
        TextView location;
    }


    public class ItemDelegateAdapter implements DelegateAdapter {

        @Override
        public View getView(int position, View convertView, ViewGroup parent, LayoutInflater inflater, Object item) {
            WaypointHolder holder;
            if (convertView == null) {
                holder = new WaypointHolder();
                convertView = inflater.inflate(R.layout.row_waypoint, null);
                holder.description = (TextView)convertView.findViewById(R.id.description);
                holder.location = (TextView)convertView.findViewById(R.id.location);
            } else {
                holder = (WaypointHolder)convertView.getTag();
            }
            convertView.setTag(holder);
            holder.description.setText(((Waypoint) item).getDescription());
            holder.location.setText(((Waypoint) item).getLatitude() + ":" + ((Waypoint) item).getLongitude() + "(±" + ((Waypoint) item).getRadius() + ")");
            return convertView;
        }

    }
}
