<?php

require_once "ConsUsuariosDB.php";
//require_once "Usuario.php";

class UsuarioDB
{
    public static function insertarDatos($nuevoUsuario){
        $db = DBConnection::getInstance();
        $db_connection = $db->getConnection();

        if(isset($_POST['submit'])) {
//        help:
//        https://stackoverflow.com/questions/35813147/insert-user-input-from-textbox-to-database-php-to-phpmyadmin-using-mysql

//        $idUsuario = $nuevoUsuario->getIdUsuario();
//        $nombreUsuario = $nuevoUsuario->getNombreUsuario();
//        $password = $nuevoUsuario->getPassword();

//        $nombreUsuario = $_POST['nombre'];
//        $password = $_POST['txtPassword'];


            $query = "INSERT INTO " . \ConstantesUsuarios\ConsUsuariosDB::TABLE_NAME . " VALUES (?,?);";

            $prep_query = $db_connection->prepare($query);
            $prep_query->bind_param('ss', $nombreUsuario, $password);

            $exito = $prep_query->execute();

            if ($exito == 1) {
                echo "<script>alert('Éxito');</script>";
            } else {
                echo "<script>alert('Fallo');</script>";
            }
        }
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