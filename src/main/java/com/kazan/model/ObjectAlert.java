package com.kazan.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "OBJECT_ALERT")
public class ObjectAlert extends BaseObject {
	public ObjectAlert() {}
	public ObjectAlert(BaseObject bo) {
		copyProperties(bo);
	}
}
