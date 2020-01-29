<?php

//require_once "ConsUsuariosDB.php";
require_once "DBUsuarios/DBConnection.php";

class UsuarioDB
{
    public static function insertarDatos()
    {
        $db = DBConnection::getInstance();
        $db_connection = $db->getConnection();

//        help:
//        https://stackoverflow.com/questions/35813147/insert-user-input-from-textbox-to-database-php-to-phpmyadmin-using-mysql
//
////        $idUsuario = $nuevoUsuario->getIdUsuario()->$_POST['idUsuario'];
//        $nombreUsuario = $nuevoUsuario->getNombreUsuario()->$_POST['nombreUsuario'];
//        $password = $nuevoUsuario->getPassword()->$_POST['password'];

//        $idUsuario = $_POST['idUsuario'];
        $nombreUsuario = $_POST['nombreUsuario'];
        $password = $_POST['password'];


//        $query = "INSERT INTO " . \ConstantesUsuarios\ConsUsuariosDB::TABLE_NAME . " VALUES (1,?,?);";

        $query = "INSERT INTO Usuarios VALUES (1, $nombreUsuario, $password)";

//        $prep_query = $db_connection->prepare($query);
//        $prep_query->bind_param('iss', $idUsuario, $nombreUsuario, $password);

//        $exito = $prep_query->execute();
//
//        if ($exito == 1) {
//            echo "Exito";
//        } else {
//            echo "Cagada";
//        }

//        if($db_connection->query($query)){
//            echo "Exito";
//        }else{
//            echo "Cagada";
//        }


//----------------------------------//
//        if(isset($_POST['submit'])){
////            $idUsuario = $_POST['idUsuario'];
////            $nombreUsuario = $_POST['nombreUsuario'];
////            $password = $_POST['password'];
//
//
//
////            $query = "INSERT INTO Usuarios VALUES ($idUsuario, $nombreUsuario, $password)";
//
////            $query = "INSERT INTO " . \ConstantesDB\ConsLibrosModel::TABLE_NAME . " VALUES (?,?,?);";
//
//            $prep_query = $db_connection->prepare($query);
//
//            $exito = $prep_query->execute();
//
//            if(mysqli_query($query)){
//                echo "Insertado Correctamente";
//            }else{
//                echo "Error al insertar";
//            }
//
////            if($exito==1){
////                echo "Insertado correctamente";
////            }else{
////                echo "Error al insertar";
////            }

    }

}