<?php


class DBUsuario
{

    private $_connection;
    private static $_instance;

    public static function getInstance()
    {
        if (!(self::$_instance instanceof self)) { // If no instance of Database, then make one
            self::$_instance = new self(); //it is the same as new Database()
        }
        return self::$_instance;
    }

    private function __construct()
    {


        // Load configuration as an array. Use the actual location of your configuration file
        // The configuration file should be like this:
        //[database]
        //host = localhost
        //dbname = myBD
        //username = myuser
        //password = mypassword
        $config = parse_ini_file('config.ini');

        // Try and connect to the database
        $this->_connection = new mysqli($config['host'], $config['username'],
            $config['password'], $config['dbname']);

        // Error handling
        if ($this->_connection->connect_error) {
            trigger_error("Failed to connect to MySQL: " . $this->_connection->connect_error,
                E_USER_ERROR);
        }
    }

    // Magic method clone to prevent duplication of connection
    public function __clone()
    {
        trigger_error("Cloning of " . get_class($this) . " not allowed: ", E_USER_ERROR);
    }

    // Magic method wakeup to prevent duplication through serialization - deserialization
    public function __wakeup()
    {
        trigger_error("Deserialization of " . get_class($this) . " not allowed: ", E_USER_ERROR);
    }

    // Get mysqli connection
    public function getConnection()
    {
        return $this->_connection;
    }


    public function closeConnection()
    {
        $this->_connection->close();
        self::$_instance=null;
    }

    public function reconnect(){
        $this->_connection->close();
        self::$_instance=null;
        return self::getInstance()->getConnection();
    }



}