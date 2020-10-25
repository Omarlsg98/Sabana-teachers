<?PHP
    include_once("connection.php");

    if(isset($_POST['select']) && $_POST['select'] == "pisos"){
		$dato1 = $_POST['dato1'];
		$query = "SELECT max(numero)as pisos FROM piso p WHERE idpiso IN (
			SELECT piso_idpiso FROM edificio_has_piso WHERE edificio_idedificio = '$dato1'
		);";
        $result = mysqli_query($conn, $query);            
        $row = mysqli_fetch_assoc($result);
        echo $row['pisos'];
        exit;
	}

?>