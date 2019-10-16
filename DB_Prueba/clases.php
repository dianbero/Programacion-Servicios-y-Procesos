<?php

class ClasePersona{
        private $nombre;
        private $apellido;
        private $edad;

        //Constructor
        function __construct($nombre_persona, $apellido_persona, $edad_persona){
                $this->nombre = $nombre_persona;
                $this->apellido = $apellido_persona;
                $this->edad = $edad_persona;
        }
        //Getters y Setters
        function set_nombre($nombre){
                $this->nombre = $nombre;
        }

        function get_nombre(){
		return $this->nombre;
        }

        function set_apellido($apellido){
                $this->apellido = $apellido;
        }

        function get_apellido(){
                return $this->apellido;
        }
	function set_edad($edad){
                $this->edad = $edad;
        }

        function get_edad(){
                return $this->edad;
        }

}

