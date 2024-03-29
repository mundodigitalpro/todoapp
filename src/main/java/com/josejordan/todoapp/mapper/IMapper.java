package com.josejordan.todoapp.mapper;

public interface IMapper <I, O>{
    public O map(I in);
}