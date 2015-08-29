package com.util;

import java.util.List;

public interface DAO<T> {
	public List<T> retrieve();
	public List<T> retrieve(String SQL);
	public T get(int id);
	public void insert(List<String> list);
}
