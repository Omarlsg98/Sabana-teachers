<?PHP
	include_once("connection.php");

	if(isset($_POST['select']) && $_POST['select'] == "edificio"){
		$query = "SELECT * FROM Edificio";
	}
	if(isset($_POST['select']) && $_POST['select'] == "salon"){
		$dato1 = $_POST['dato1'];	
		$query = "SELECT * FROM salon p WHERE Edificio_has_Piso_Edificio_idEdificio = '$dato1';";
	}
	if(isset($_POST['select']) && $_POST['select'] == "curso"){
		$query = "SELECT * FROM Curso";
	}	
	if(isset($_POST['select']) && $_POST['select'] == "curso2"){
		$dato1 = $_POST['dato1'];
		$query = "SELECT * FROM Curso p WHERE idcurso IN (
			SELECT Curso_idCurso from clase where Curso_idCurso = '$dato1'
		);";
	}	
	if(isset($_POST['select']) && $_POST['select'] == "clase"){
		$dato1 = $_POST['dato1'];
		$query = "SELECT * FROM clase p WHERE Salon_idSalon = '$dato1' AND Dia = weekday(CURDATE()) AND hour(curtime()) = HOUR(horaini);";
	}
	if(isset($_POST['select']) && $_POST['select'] == "piso"){
		$dato1 = $_POST['dato1'];
		$query = "SELECT * FROM piso p WHERE idpiso IN (
			SELECT piso_idpiso FROM edificio_has_piso WHERE edificio_idedificio = '$dato1'
		);";
	}	
	if(isset($_POST['select']) && $_POST['select'] == "pisos"){
		$dato1 = $_POST['dato1'];
		$query = "SELECT count(idPiso) FROM piso p WHERE idpiso IN (
			SELECT piso_idpiso FROM edificio_has_piso WHERE edificio_idedificio = '$dato1'
		);";
	}
	if(isset($_POST['select']) && $_POST['select'] == "fac"){
		$query = "SELECT * FROM Facultad";
	}	
	if(isset($_POST['select']) && $_POST['select'] == "fac2"){
		$dato1 = $_POST['dato1'];
		$query = "SELECT * FROM Facultad p WHERE idfacultad IN (
			SELECT Facultad_idFacultad from curso where Facultad_idFacultad = '$dato1'
		);";
	}
	if(isset($_POST['select']) && $_POST['select'] == "prof"){
		$query = "SELECT * FROM Profesor";
	}	
	if(isset($_POST['select']) && $_POST['select'] == "prof2"){
		$dato1 = $_POST['dato1'];
		$query = "SELECT * FROM Profesor p WHERE idprofesor IN (
			SELECT Profesor_idProfesor from clase where Profesor_idProfesor = '$dato1'
		);";
	}
	if(isset($_POST['select']) && $_POST['select'] == "rep"){
		$query = "SELECT * FROM Reporte";
	}
	if(isset($_POST['select']) && $_POST['select'] == "obs"){
		$dato1 = $_POST['dato1'];
		$query = "SELECT * FROM Observacion WHERE Reporte_idReporte = '$dato1'";
	}
    if(isset($_POST['select']) && $_POST['select'] == "pisos"){
		$dato1 = $_POST['dato1'];
		$query = "SELECT count(idPiso) as pisos FROM piso p WHERE idpiso IN (
			SELECT piso_idpiso FROM edificio_has_piso WHERE edificio_idedificio = '$dato1'
		);";
	}
	if(isset($_POST['select']) && $_POST['select'] == "vot"){
		$query = "SELECT * FROM voto p;";
	}
	if(isset($_POST['select']) && $_POST['select'] == "votcl"){
		$dato1 = $_POST['dato1'];
		$query = "SELECT * FROM voto p WHERE Clase_idClase = '$dato1';";
	}





	$result = mysqli_query($conn, $query);

	while($row = mysqli_fetch_assoc($result)){
		$data[] = $row;
	}

	echo json_encode($data);
	exit;
?>