<?php


class DataBase
{
   private $connection;
   private $instance;

   public static function getDBInstance(){
       if(!(self::$instance instanceof self)){//Si no encuentra instancia de la base de datos, crea una nueva
           self::$instance = new self();
       }
       return self::$instance;
   }

   //Contructor (Probar más tarde)

}