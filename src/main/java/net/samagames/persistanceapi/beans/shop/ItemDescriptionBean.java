/*
===============================================================
   _____                       ______
  / ___/____ _____ ___  ____ _/ ____/___ _____ ___  ___  _____
  \__ \/ __ `/ __ `__ \/ __ `/ / __/ __ `/ __ `__ \/ _ \/ ___/
 ___/ / /_/ / / / / / / /_/ / /_/ / /_/ / / / / / /  __(__  )
/____/\__,_/_/ /_/ /_/\__,_/\____/\__,_/_/ /_/ /_/\___/____/

===============================================================
  Persistance API
  Copyright (c) for SamaGames, all right reserved
  By MisterSatch, January 2016
===============================================================
*/
package net.samagames.persistanceapi.beans.shop;

import java.beans.ConstructorProperties;

public class ItemDescriptionBean
{
    /* Database structure

    Table : item_description
    +-------------------+--------------+------+-----+--------------+-------+
    | Field             | Type         | Null | Key | Default      | Extra |
    +-------------------+--------------+------+-----+--------------+-------+
    | item_id           | int(11)      | NO   | PRI | NULL         |       |
    | item_name         | varchar(45)  | NO   |     | Non définie  |       |
    | item_desc         | varchar(255) | NO   |     | Non définie  |       |
    | price_coins       | int(11)      | NO   |     | 42424242     |       |
    | price_stars       | int(11)      | NO   |     | 42424242     |       |
    | game_category     | tinyint(4)   | NO   |     | NULL         |       |
    | item_minecraft_id | varchar(45)  | NO   |     | NULL         |       |
    | item_rarity       | varchar(45)  | YES  |     | NULL         |       |
    | rank_accessibility| varchar(45)  | YES  |     | NULL         |       |
    +-------------------+--------------+------+-----+--------------+-------+
    */

    // Defines
    private int itemId;
    private String itemName;
    private String itemDesc;
    private int priceCoins;
    private int priceStars;
    private int gameCategory;
    private String itemMinecraftId;
    private String itemRarity;
    private String rankAccessibility;

    // Constructor
    @ConstructorProperties({"itemId", "itemName", "itemDesc", "priceCoins", "priceStars", "gameCategory", "itemMinecraftId", "itemRarity", "rankAccessibility"})
    public ItemDescriptionBean(int itemId, String itemName, String itemDesc, int priceCoins, int priceStars, int gameCategory, String itemMinecraftId, String itemRarity, String rankAccessibility)
    {
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemDesc = itemDesc;
        this.priceCoins = priceCoins;
        this.priceStars = priceStars;
        this.gameCategory = gameCategory;
        this.itemMinecraftId = itemMinecraftId;
        this.itemRarity = itemRarity;
        this.rankAccessibility = rankAccessibility;
    }

    // Getters
    public int getItemId() { return this.itemId; }
    public String getItemName() { return this.itemName; }
    public String getItemDesc() { return this.itemDesc; }
    public int getPriceCoins() { return this.priceCoins; }
    public int getPriceStars() { return this.priceStars; }
    public int getGameCategory() { return this.gameCategory; }
    public String getItemMinecraftId() { return this.itemMinecraftId; }
    public String getItemRarity() { return this.itemRarity; }
    public String getRankAccessibility() { return this.rankAccessibility; }

    // Setters

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }
    public void setItemName(String itemName) { this.itemName = itemName; }
    public void setItemDesc(String itemDesc) { this.itemDesc = itemDesc; }
    public void setPriceCoins(int priceCoins) { this.priceCoins = priceCoins; }
    public void setPriceStars(int priceStars) { this.priceStars = priceStars; }
    public void setGameCategory(int gameCategory) { this.gameCategory = gameCategory; }
    public void setItemMinecraftId(String itemMinecraftId) { this.itemMinecraftId = itemMinecraftId; }
    public void setItemRarity(String itemRarity) { this.itemRarity = itemRarity; }
    public void setRankAccessibility(String rankAccessibility) { this.rankAccessibility = rankAccessibility; }
}