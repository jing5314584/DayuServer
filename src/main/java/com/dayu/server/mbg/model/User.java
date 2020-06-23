package com.dayu.server.mbg.model;

import java.io.Serializable;

public class User implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column d_user.idx
     *
     * @mbg.generated Tue Jun 23 12:01:08 CST 2020
     */
    private Integer idx;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column d_user.fish_coin
     *
     * @mbg.generated Tue Jun 23 12:01:08 CST 2020
     */
    private Integer fishCoin;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table d_user
     *
     * @mbg.generated Tue Jun 23 12:01:08 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column d_user.idx
     *
     * @return the value of d_user.idx
     *
     * @mbg.generated Tue Jun 23 12:01:08 CST 2020
     */
    public Integer getIdx() {
        return idx;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column d_user.idx
     *
     * @param idx the value for d_user.idx
     *
     * @mbg.generated Tue Jun 23 12:01:08 CST 2020
     */
    public void setIdx(Integer idx) {
        this.idx = idx;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column d_user.fish_coin
     *
     * @return the value of d_user.fish_coin
     *
     * @mbg.generated Tue Jun 23 12:01:08 CST 2020
     */
    public Integer getFishCoin() {
        return fishCoin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column d_user.fish_coin
     *
     * @param fishCoin the value for d_user.fish_coin
     *
     * @mbg.generated Tue Jun 23 12:01:08 CST 2020
     */
    public void setFishCoin(Integer fishCoin) {
        this.fishCoin = fishCoin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table d_user
     *
     * @mbg.generated Tue Jun 23 12:01:08 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", idx=").append(idx);
        sb.append(", fishCoin=").append(fishCoin);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}