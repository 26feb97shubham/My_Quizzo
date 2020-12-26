package com.example.my_quizzo.chat;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.my_quizzo.R;
import com.example.my_quizzo.appcontrollers.ProfileAndChatController;

import java.util.ArrayList;

public class ChatViewAdapter extends BaseAdapter {

    private Context mContext;
    private ArrayList<Message> mMessages;
    private ProfileAndChatController controller;

    public ChatViewAdapter(Context context, ArrayList<Message> messages, ProfileAndChatController controller) {
        super();
        this.mContext = context;
        this.mMessages = messages;
        this.controller = controller;
        this.notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return mMessages.size();
    }

    @Override
    public Object getItem(int position) {
        return mMessages.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    private static class ViewHolder
    {
        LinearLayout chatRow;
        TextView message;
        TextView timestamp;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Message message = (Message)this.getItem(position);

        ViewHolder holder;
        if (convertView == null){
            holder = new ViewHolder();
            convertView = LayoutInflater.from(mContext).inflate(R.layout.chat_row, parent, false);
            holder.chatRow = (LinearLayout) convertView.findViewById(R.id.chat_row_wrapper);
            holder.message = (TextView) convertView.findViewById(R.id.message_text);
            holder.timestamp = (TextView) convertView.findViewById(R.id.message_time);
            holder.timestamp.setTextColor(Color.LTGRAY);
            convertView.setTag(holder);
        }
        return null;
    }
}
