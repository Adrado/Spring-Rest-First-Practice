package com.crazyclass.testrest.Models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class User extends Entity
{
    private String Name;
    private String Email;
    private String Password;
    private String FirstSurname;
    private String SecondSurname;
}