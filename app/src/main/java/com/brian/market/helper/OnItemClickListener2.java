package com.brian.market.helper;

import com.brian.market.modelsList.ProductDetails;

public interface OnItemClickListener2 {
    void onItemClick(ProductDetails item);
    void onRemoveFav(int position);
    void onShare(ProductDetails item);
    void onAddCart(ProductDetails item);
}
