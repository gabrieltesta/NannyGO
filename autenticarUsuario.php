<?php
	require_once('conexao.php');

	$login = $_GET['login'];
	$senha = $_GET['senha'];
	
	$sql = "SELECT * FROM vw_usuario WHERE login='".$login."' and senha='".$senha."';";
	
	$select = mysqli_query($conexao, $sql);
	
	if ($rs=mysqli_fetch_array($select))
	{
		$usuario = array(
			"idUsuario"=>$rs['id_usuario'],
			"nome"=>$rs['nome'],
			"sexo"=>$rs['sexo'],
			"telefone"=>$rs['telefone'],
			"email"=>$rs['email'],
			"login"=>$rs['login'],
			"senha"=>$rs['senha'],
			"dataNascimento"=>$rs['data_nascimento'],
			"imagem"=>$rs['imagem'],
			"statusBaba"=>$rs['statusBaba'],
			"cidade"=>$rs['cidade'],
			"estado"=>$rs['estado'],
			"uf"=>$rs['uf']);
			
		$usuarioJSON = json_encode($usuario);
		
		echo($usuarioJSON);
	}
	
	mysqli_close($conexao);
	
?>
