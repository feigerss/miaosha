package com.miaoshaproject.dataobject;

public class ItemStockDO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item_stock.id
     *
     * @mbg.generated Wed Aug 14 16:06:40 CST 2019
     */
    private Long id;
    private String imgUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item_stock.stock
     *
     * @mbg.generated Wed Aug 14 16:06:40 CST 2019
     */
    private Integer stock;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item_stock.item_id
     *
     * @mbg.generated Wed Aug 14 16:06:40 CST 2019
     */
    private Long itemId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item_stock.id
     *
     * @return the value of item_stock.id
     *
     * @mbg.generated Wed Aug 14 16:06:40 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item_stock.id
     *
     * @param id the value for item_stock.id
     *
     * @mbg.generated Wed Aug 14 16:06:40 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item_stock.stock
     *
     * @return the value of item_stock.stock
     *
     * @mbg.generated Wed Aug 14 16:06:40 CST 2019
     */
    public Integer getStock() {
        return stock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item_stock.stock
     *
     * @param stock the value for item_stock.stock
     *
     * @mbg.generated Wed Aug 14 16:06:40 CST 2019
     */
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item_stock.item_id
     *
     * @return the value of item_stock.item_id
     *
     * @mbg.generated Wed Aug 14 16:06:40 CST 2019
     */
    public Long getItemId() {
        return itemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item_stock.item_id
     *
     * @param itemId the value for item_stock.item_id
     *
     * @mbg.generated Wed Aug 14 16:06:40 CST 2019
     */
    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}