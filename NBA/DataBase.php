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
   }

    //Contructor
    private function __construct(){
       //Carga la configuración config.ini como una array
       $config = parse_ini_file('config/config.ini');

       //Conectar con la base de datos
       $this->connection = new mysqli($config['host'], $config['username'], $config['dbname'],$config['password']); //Tiene los elementos del array creado
        //Para tratamiento de error

}

}