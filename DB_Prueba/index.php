
<html>
<head></head>
<body>
<?php

require_once "clases.php";

$persona = new ClasePersona("Carlos","Ruiz", 25);

echo "<p>Hola ".$persona->get_nombre()."</p>";
?>

</body>
</html>

