package com.example.android.ItemModel;

import com.example.android.ItemLocationEnum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<ItemModel> ITEMS = new ArrayList<ItemModel>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, ItemModel> ITEM_MAP = new HashMap<String, ItemModel>();

    private static final int COUNT = 25;

    static {
        // Add some sample items
        addItemModel(new ItemModel("Macbook", "Do your homework, or chill", "mac", 1, 1, 9, ItemLocationEnum.PrimaryHand));
        addItemModel(new ItemModel("Final example", "Time to study hard", "paper", 5, 1, 7, ItemLocationEnum.Feet));
        addItemModel(new ItemModel("Beer", "Don't grab my beer", "beer", 1, 5, 1, ItemLocationEnum.OffHand));
    }

    private static void addItemModel(ItemModel item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    //private static ItemModel createItemModel(int position) {
    //    return new ItemModel(String, "Item " + position, makeDetails(position));
    //}

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class ItemModel {
        public final String id = UUID.randomUUID().toString();
        public final int Range;
        public final int Damage;
        public final int Value;
        public final String Name;
        public final String Description;
        public final String Guid = id;
        public final String ImageURL;
        public final ItemLocationEnum Location;


        public ItemModel(String name,
                         String description,
                         String url,
                         int range,
                         int damage,
                         int value,
                         ItemLocationEnum location) {
            this.Name = name;
            this.Description = description;
            this.Damage = damage;
            this.ImageURL = url;
            this.Range = range;
            this.Value = value;
            this.Location = location;
        }

        @Override
        public String toString() {
            return Name;
        }
    }
}
