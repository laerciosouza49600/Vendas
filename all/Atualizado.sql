-- --------------------------------------------------------
-- Servidor:                     127.0.0.1
-- Versão do servidor:           10.1.36-MariaDB - mariadb.org binary distribution
-- OS do Servidor:               Win32
-- HeidiSQL Versão:              9.5.0.5196
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Copiando dados para a tabela sistema.produto: ~42 rows (aproximadamente)
/*!40000 ALTER TABLE `produto` DISABLE KEYS */;
INSERT INTO `produto` (`id_produto`, `nome`, `preco`) VALUES
	(1, 'arroz', 3),
	(2, 'feijão', 5),
	(3, 'Farinha', 4),
	(4, 'Macarrão', 3),
	(5, 'azeitona', 2),
	(6, 'Biscoito', 3),
	(7, 'Cardeno', 10),
	(8, 'chocolate', 5),
	(9, 'Sabão', 3),
	(10, 'Cereal', 7),
	(11, 'ovo', 1),
	(12, 'café', 4),
	(13, 'Açucar', 2),
	(14, 'sal', 1),
	(15, 'Fósforo', 0.6),
	(16, 'barbeador', 2),
	(17, 'frauda', 10),
	(18, 'absorvente', 4),
	(19, 'papel', 3),
	(20, 'guardanapo', 1),
	(21, 'balinha', 0.5),
	(22, 'gilete', 2),
	(23, 'carvão', 2),
	(24, 'sabonete', 2),
	(25, 'escova', 4),
	(26, 'pasta', 3),
	(27, 'shampoo', 12),
	(28, 'creme', 10),
	(29, 'hidratante', 9),
	(30, 'leite', 3),
	(31, 'iorgute', 1),
	(32, 'nescau', 5),
	(33, 'refrigerante', 7),
	(34, 'Kiwi', 6),
	(35, 'lâmpada', 4),
	(36, 'sandálias', 20),
	(37, 'desodorante', 7),
	(38, 'bombril', 2),
	(39, 'acetona', 2),
	(40, 'esmalte', 4),
	(41, 'batata', 4),
	(42, 'salgado', 2.25);
/*!40000 ALTER TABLE `produto` ENABLE KEYS */;

-- Copiando dados para a tabela sistema.usuarios: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` (`id_usuario`, `nome`, `cpf`) VALUES
	(1, 'laercio', '060-920-11'),
	(2, 'Ester', '060-345-10'),
	(3, 'Diego', '060-893-10'),
	(4, 'William', '060-342-10');
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
