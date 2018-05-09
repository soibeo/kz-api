package com.kazan.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "OBJECT_MASTER")
public class ObjectMaster extends BaseObject {
	public ObjectMaster() {}
	public ObjectMaster(BaseObject bo) {
		copyProperties(bo);
	}
}
