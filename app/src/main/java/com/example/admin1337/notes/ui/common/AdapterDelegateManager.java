package com.example.admin1337.notes.ui.common;

import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.ViewGroup;
import java.util.NoSuchElementException;

/**
 * @author Alexey Mazaev
 */

public class AdapterDelegateManager<T> {

  private SparseArray delegates = new SparseArray();

  public void addDelegate(AdapterDelegate<T> delegate) {
    delegates.put(delegates.size(), delegate);
  }

  public int getItemViewType(T item, int position) {
    for(int i = 0; i < delegates.size() - 1; i++){

      AdapterDelegate<T> delegate = (AdapterDelegate<T>)delegates.valueAt(i);

      if(delegate.isForViewType(item, position)){
        return delegates.keyAt(i);
      }
    }
    throw new NoSuchElementException("");
  }

  public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
    return getDelegateForViewType(viewType).onCreateViewHolder(parent);
  }

  public void onBindViewHolder(T item, int position, RecyclerView.ViewHolder viewHolder) {
    getDelegateForViewType(viewHolder.getItemViewType()).onBindViewHolder(item, position, viewHolder);
  }

  public AdapterDelegate<T> getDelegateForViewType(int viewType) {
    return (AdapterDelegate<T>) delegates.get(viewType);
  }
}
