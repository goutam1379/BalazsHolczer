package com.cli.stackLinkedList;

public interface Stack <T> {
	public void push(T data);
	public T pop();
	public int size();
	public boolean isEmpty();
}