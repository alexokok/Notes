package com.example.admin1337.notes.ui.common;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Alexey Mazaev
 */

public class BaseAdapter<T>
    extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

  private AdapterDelegateManager<T> manager = new AdapterDelegateManager<>();

  private ArrayList<T> list = new ArrayList<>();

  @Override
  public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    return manager.onCreateViewHolder(parent, viewType);
  }

  @Override
  public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
    manager.onBindViewHolder(list.get(position), position, holder);
  }

  @Override
  public int getItemCount() {
    return list.size();
  }

  public void addData(T item) {
    list.add(item); notifyDataSetChanged();
  }

  public void updateData(T item, int position) {
    list.set(position, item); notifyItemChanged(position);
  }

  public void removeData(int position) {
    list.remove(position); notifyItemRemoved(position);
  }

  public void setData(List<T> items) {
    list.clear(); list.addAll(items);

    notifyDataSetChanged();
  }
}
