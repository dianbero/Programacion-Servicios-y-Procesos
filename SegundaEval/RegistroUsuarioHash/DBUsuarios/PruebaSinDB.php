<?php

//require_once "ConsUsuariosDB.php";

class PruebaSinDB
{
    public static function getDatos(){
        $db = DBUsuario::getInstance();
        $db_connection = $db->getConnection();

//        help:
//        https://stackoverflow.com/questions/35813147/insert-user-input-from-textbox-to-database-php-to-phpmyadmin-using-mysql

        if(isset($_POST['submit'])){
            $idUsuario = $_POST['idUsuario'];
            $nombreUsuario = $_POST['nombreUsuario'];
            $password = $_POST['password'];

            $query = "INSERT INTO Usuarios VALUES ($idUsuario, $nombreUsuario, $password)";

            if(mysqli_query($query)){
                echo "Insertado Correctamente";
            }else{
                echo "Error al insertar";
            }
        }

    }
}