package com.kazan.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "OBJECT")
public class ObjectNormal extends BaseObject {
	public ObjectNormal() {}
	public ObjectNormal(BaseObject bo) {
		copyProperties(bo);
	}
}
