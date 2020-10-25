<?PHP
    include_once("connection.php");
    if( isset($_POST['txtAsistencia']) && isset($_POST['txtClase_idClase'])) {
        $Asistencia = $_POST['txtAsistencia'];
        $Clase_idClase = $_POST['txtClase_idClase'];

        $query = "INSERT INTO Voto(Asistencia,Clase_idClase, Fecha) VALUES ('$Asistencia', '$Clase_idClase', curdate())
        SELECT LAST_INSERT_ID() AS ID FROM VOTO LIMIT 1;";

        $result = mysqli_query($conn, $query);
        $row = mysqli_fetch_assoc($result);
        echo $row['ID'];
        exit;
        if($result > 0){
            if(isset($_POST['mobile']) && $_POST['mobile'] == "android"){
                echo "success1";
                exit;
            }
            echo "Insert Successfully";
        } else{
            echo "Insert Failed <br/>";
        }
    }

    if( isset($_POST['txtDescripcion']) && isset($_POST['txtReporte_idReporte']) && isset($_POST['txtReporte_Clase_idClase'])) {
        $Descripcion = $_POST['txtDescripcion'];
        $Clase_idClase = $_POST['txtReporte_idReporte'];
        $Reporte_Clase_idClase =  $_POST['txtReporte_Clase_idClase'];

        $query = "INSERT INTO Observacion_voto(Descripcion,Reporte_idReporte,Reporte_Clase_idClase) VALUES ('$Asistencia', '$Clase_idClase', '$Reporte_Clase_idClase')";

        $result = mysqli_query($conn, $query);

        if($result > 0){
            if(isset($_POST['mobile']) && $_POST['mobile'] == "android"){
                echo "success2";
                exit;
            }
            echo "Insert Successfully";
        } else{
            echo "Insert Failed <br/>";
        }
    }

    if( isset($_POST['txtInconsistencia']) && isset($_POST['txtClase_idClase'])) {
        $Inconsistencia = $_POST['txtInconsistencia'];
        $Clase_idClase = $_POST['txtClase_idClase'];

        $query = "INSERT INTO Inconsistencia(Inconsistencia,Clase_idClase) VALUES ('$Inconsistencia', '$Clase_idClase')";

        $result = mysqli_query($conn, $query);

        if($result > 0){
            if(isset($_POST['mobile']) && $_POST['mobile'] == "android"){
                echo "success3";
                exit;
            }
            echo "Insert Successfully";
        } else{
            echo "Insert Failed <br/>";
        }
    }
?>