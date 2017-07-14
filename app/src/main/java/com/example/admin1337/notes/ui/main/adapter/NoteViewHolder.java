package com.example.admin1337.notes.ui.main.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.example.admin1337.notes.R;

/**
 * @author Alexey Mazaev
 */

public class NoteViewHolder
    extends RecyclerView.ViewHolder {

  @BindView(R.id.tvTitle) private TextView title;

  @BindView(R.id.tvBody) private TextView body;

  public NoteViewHolder(View itemView) {
    super(itemView); ButterKnife.bind(this, itemView);
  }
}
