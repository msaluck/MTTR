package com.util;

import java.util.List;

public interface DAO<T> {
	public List<T> retrieve();
	public T get(int id);
	public void insert(List<String> list);
}
