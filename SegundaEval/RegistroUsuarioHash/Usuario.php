<?php


class Usuario
{
    private $idUsuario;
    private $nombreUsuario;
    private $password;

    public function __construct($idUsuario, $nombreUsuario, $password){
        $this->idUsuario = $idUsuario;
        $this->nombreUsuario = $nombreUsuario;
        $this->password = $password;
}

    //seralize:
    public function jsonSerialize(){
            return array(
                'idUsuario'=>$this->idUsuario,
                'nombreUsuario'=>$this->nombreUsuario,
                'password'=>$this->password
            );
    }

    public function __sleep(){
            return array('idUsuario','nombreUsuario','password');
    }

    /**
     * @return mixed
     */
    public function getIdUsuario()
    {
        return $this->idUsuario;
    }

    /**
     * @param mixed $idUsuario
     */
    public function setIdUsuario($idUsuario)
    {
        $this->idUsuario = $idUsuario;
    }

    /**
     * @return mixed
     */
    public function getNombreUsuario()
    {
        return $this->nombreUsuario;
    }

    /**
     * @param mixed $nombreUsuario
     */
    public function setNombreUsuario($nombreUsuario)
    {
        $this->nombreUsuario = $nombreUsuario;
    }

    /**
     * @return mixed
     */
    public function getPassword()
    {
        return $this->password;
    }

    /**
     * @param mixed $password
     */
    public function setPassword($password)
    {
        $this->password = $password;
    }



}