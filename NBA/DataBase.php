<?php


class DataBase
{
   private $connection;
   private $instance;

   public static function getDBInstance(){
       if(!(self::$instance instanceof self)){//Si no encuentra instancia de la base de datos, crea una nueva
           self::$instance = new self();
       }
       return self::$instance; //Devuelve la nueva base de datos creada

       //Carga la configuración config.ini como una array
       $config = parse_ini_file('config/config.ini');

       //Conectar con la base de datos

       this->connection = new mysqli($config['']); //Terminar


   }

   //Contructor (Probar más tarde)

}