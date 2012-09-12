package models.support;

import models.enumeration.*;

import java.util.*;


public class OrderParams {

    private List<OrderParam> orderParams;

    public OrderParams() {
        this.orderParams = new ArrayList<OrderParam>();
    }

    public OrderParams add(String field, Direction direction) {
        this.orderParams.add(new OrderParam(field, direction));
        return this;
    }

    public List<OrderParam> getOrderParams() {
        return orderParams;
    }

    public List<OrderParam> clean() {
        this.orderParams.clear();
        return this.orderParams;
    }
}
