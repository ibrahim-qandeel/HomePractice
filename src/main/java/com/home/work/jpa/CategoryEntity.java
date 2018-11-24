package com.home.work.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;


/**
 * The persistent class for the Category database table.
 */
@Entity
@Table(name = "CATEGORY")
public class CategoryEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "CATEGORY_ID")
    private long categoryId;

    @Column(name = "NAME")
    private String categoryName;

    public long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}