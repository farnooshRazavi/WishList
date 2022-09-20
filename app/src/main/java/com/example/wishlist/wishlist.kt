package com.example.wishlist

class wishlist(val wishItem: String, val isOnline: Boolean) {
    companion object {
        private var LastItem = 0
        fun createList(numItems: Int): ArrayList<wishlist> {
            val wishItems = ArrayList<wishlist>()
            for (i in 1..numItems) {
                wishItems.add(wishlist("Person " + ++LastItem, i <= numItems / 2))
            }
            return wishItems
        }
    }
}
