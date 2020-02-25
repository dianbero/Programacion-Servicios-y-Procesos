<?php

//require_once "ConsUsuariosDB.php";
require_once "DBConnection.php";

class UsuarioDB
{
    public static function insertarDatos()
    {
        $db = DBConnection::getInstance();
        $db_connection = $db->getConnection();

        if (isset($_POST['submit'])) {
//        help:
//        https://stackoverflow.com/questions/35813147/insert-user-input-from-textbox-to-database-php-to-phpmyadmin-using-mysql

//        $idUsuario = $nuevoUsuario->getIdUsuario();
//        $nombreUsuario = $nuevoUsuario->getNombreUsuario();
//        $password = $nuevoUsuario->getPassword();


            $nombreUsuario = $_POST['nombre'];
//        $password = $_POST['txtPassword'];
            $password = password_hash($_POST['txtPassword'], PASSWORD_DEFAULT); //función de hash

//            $query = "INSERT INTO " . \ConstantesUsuarios\ConsUsuariosDB::TABLE_NAME . " VALUES (?,?);";

            /*En phpMyAdmin aunque tengo puesto que sea autogenerada, no me acepta el insert con sólo dos valores,
            necesita el valor del id también, hay que revisar eso, ver cómo se insertan valores para tablas con
            id autogenerado en mySql*/
            $query = "INSERT"."INTO Usuarios VALUES (?,?,?);";

            $prep_query = $db_connection->prepare($query);
//            $prep_query->bind_param('ss', $nombreUsuario, $password);
            $prep_query->bind_param('iss', $nombreUsuario, $password);

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