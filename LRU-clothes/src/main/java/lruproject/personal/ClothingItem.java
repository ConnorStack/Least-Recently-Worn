package lruproject.personal;

//CREATE A HARD CODED LIST OF ACCEPTABLE ITEMS OF CLOTHING

public class ClothingItem {
    private String description = "";
    private String type = "";
    private int clothing_id = -1;

    public ClothingItem(String description, String type, int id) {
        this.description = description;
        this.type = type;
        this.clothing_id = id;
    }

}
