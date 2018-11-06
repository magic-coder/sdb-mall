package io.sdb.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseArea<M extends BaseArea<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Long id) {
		set("id", id);
	}
	
	public java.lang.Long getId() {
		return getLong("id");
	}

	public void setCreateDate(java.util.Date createDate) {
		set("create_date", createDate);
	}
	
	public java.util.Date getCreateDate() {
		return get("create_date");
	}

	public void setModifyDate(java.util.Date modifyDate) {
		set("modify_date", modifyDate);
	}
	
	public java.util.Date getModifyDate() {
		return get("modify_date");
	}

	public void setVersion(java.lang.Long version) {
		set("version", version);
	}
	
	public java.lang.Long getVersion() {
		return getLong("version");
	}

	public void setOrders(java.lang.Integer orders) {
		set("orders", orders);
	}
	
	public java.lang.Integer getOrders() {
		return getInt("orders");
	}

	public void setFullName(java.lang.String fullName) {
		set("full_name", fullName);
	}
	
	public java.lang.String getFullName() {
		return getStr("full_name");
	}

	public void setGrade(java.lang.Integer grade) {
		set("grade", grade);
	}
	
	public java.lang.Integer getGrade() {
		return getInt("grade");
	}

	public void setName(java.lang.String name) {
		set("name", name);
	}
	
	public java.lang.String getName() {
		return getStr("name");
	}

	public void setTreePath(java.lang.String treePath) {
		set("tree_path", treePath);
	}
	
	public java.lang.String getTreePath() {
		return getStr("tree_path");
	}

	public void setParentId(java.lang.Long parentId) {
		set("parent_id", parentId);
	}
	
	public java.lang.Long getParentId() {
		return getLong("parent_id");
	}

}