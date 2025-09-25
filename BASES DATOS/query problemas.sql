USE hospital;

# Obtener el nombre de todos los pacientes no llamados María

SELECT nombre FROM pacientes WHERE nombre<>Maria;


    # Obtener la zona y planta de las camas a las que no se les ha cambiado sábanas el 16 de febrero de 2021
SELECT zona,planta FROM camas WHERE fechaCambioSabanas<>2021-02-16;

    # Obtener el id_paciente del paciente que no tengan el DNI 33333333C
SELECT id_paciente FROM pacientes WHERE dni<>"33333333C";

    # Obtener turno, nombre y especialidad de los médicos con id_medico diferentes de 2, 4 y 5
SELECT turno, nombre, especialidad FROM medicos WHERE id_medico<>2 and id_medico<>4 and id_medico<> 5;


    # Medicos con especialidad que no sea cardiología
    SELECT * FROM medicos WHERE especialidad<>"cardiologia";


    # id Médicos que no han atendido al paciente 2
SELECT * FROM medicos WHERE id_medico=(SELECT fk_id_medico FROM pacientes_medicos WHERE fk_id_paciente=2);


    # ids médicos no han atendido a ningún paciente 
SELECT * FROM medicos WHERE id_medico NOT IN(SELECT fk_id_medico FROM pacientes_medicos);

    # Pacientes atendidos por médicos que no sean los de id 7 y 9
    SELECT * FROM pacientes WHERE id_paciente=(SELECT fk_id_paciente FROM pacientes_medicos WHERE NOT fk_id_medico<>7 OR fk_id_medico<>9);

   # WHERE NOT (fk_id_medico=7 OR fk_id_medico=9);


    # DISTINCT, SUM, COUNT, AVG

    # Nombre de todos los médicos que han atendido pacientes
SELECT nombre from medicos WHERE id_medico=(select fk_id_medico FROM pacientes_medicos WHERE 
    # Zona de las camas en las que han estado pacientes:

    # Nombre del médico y nombre del paciente en cada atención;


    # DNI y especialidad de los médicos que han atendido a pacientes que se apellidan Pérez

                            
    # Pacientes atendidos por médicos de pediatría;

                            
    # Obtener la cantidad de veces que aparece el paciente con id 1 en la tabla Pacientes;

    # Obtener la suma los ids de los médicos que se llaman Carlos;


    # Obtener los apellidos que hay en la tabla Pacientes sin repetir;


    # Obtener la suma, cantidad y media de los ids de las camas;


    # Obtener los médicos que no han atendido a la paciente María Pérez, ni a Ana Rodríguez



                            
    # Actualizar el nombre y apellido de los pacientes atendidos por Gabriela Martínez Seoane a Marta Ramírez


    # Contar la cantidad de médicos por especialidad:
    
    
    # Contar la cantidad de médicos por especialidad de ginecología y de obstetricia: 
    
    
	# Obtener el nombre de los pacientes y la planta de la cama donde están ingresados:

    
    # Obtener el nombre del paciente y la especialidad del médico que lo atiende:
