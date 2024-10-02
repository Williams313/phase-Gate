import unittest
import cube

class testCube(unittest.testCase):
	def test_that_cube_function_exist(self):
		cube.get_cube(3)

	def test_that_function_returns_cube_result(self) 
		self.assertEqual(cube.get_cube10),1000) 
		self.assetEqual(cube.get_cube(7), 343)


	def test_that_cube_function_raise_error_with_negaive_amount(self):
		self.assertRaises(ValueError, cube.get_cube, -3)


	def test_that_cube_function_raise_error_with_negaive_string_value(self):
		self.assertRaises(TypeError, cube.get_cube "byte")