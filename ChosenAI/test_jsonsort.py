import unittest
import jsonsort
from collections import Counter


class Testjsonsort(unittest.TestCase):

    # test sorting by age
    def test_animaux(self):
        test_json = '{"animals": [{"age": 7}, {"age": 5}, {"age": 6}]}'
        expected_ = '{"animals": [{"age": 5}, {"age": 6}, {"age": 7}]}'
        self.assertEqual(jsonsort.animaux(test_json, sort_by='age'), expected_)

    # test sorting by color
    def test_animaux(self):
        test_json = '{"animals": [{"color": [{"code": "white"}]}, {"color": [{"code": "black"}]}, {"color": [{"code": "brown"}]}]}'
        expected_ = '{"animals": [{"color": [{"code": "black"}]}, {"color": [{"code": "brown"}]}, {"color": [{"code": "white"}]}]}'
        self.assertEqual(jsonsort.animaux(test_json, sort_by='color'), expected_)

    # test sorting by type
    def test_animaux(self):
        test_json = '{"animals": [{"type": pig}, {"type": cat}, {"type": dog}]}'
        expected_ = '{"animals": [{"type": cat}, {"type": dog}, {"type": pig}]}'
        self.assertEqual(jsonsort.animaux(test_json, sort_by='type'), expected_)

    # test distribution of characters is maintained on completion of the sort
    def test_animaux(self):
        test_json = '{"animals": [{"age": 7}, {"age": 5}, {"age": 6}]}'
        expected_ = '{"animals": [{"age": 5}, {"age": 6}, {"age": 7}]}'
        self.assertEqual(Counter(jsonsort.animaux(test_json, sort_by='age')), Counter(expected_))

    # test sorting a fuller dataset by age
    def test_animaux(self):
        test_json = '''{
            "animals": [
            {"type": "cat", "name": "Doe", "age": 7, "color": [{"code": "white"}]},
            {"type": "dog", "name": "Coe", "age": 5, "color": [{"code": "brown"}]},
            {"type": "pig", "name": "Poe", "age": 6, "color": [{"code": "black"}]}
            ]}'''
        expected_ = '{"animals": [{"type": "dog", "name": "Coe", "age": 5, "color": [{"code": "brown"}]}, {"type": "pig", "name": "Poe", "age": 6, "color": [{"code": "black"}]}, {"type": "cat", "name": "Doe", "age": 7, "color": [{"code": "white"}]}]}'
        self.assertEqual(jsonsort.animaux(test_json, sort_by='age'), expected_)

    # test sorting a fuller dataset by type, in reverse
    def test_animaux(self):
        test_json = '''{
            "animals": [
            {"type": "cat", "name": "Doe", "age": 7, "color": [{"code": "white"}]},
            {"type": "dog", "name": "Coe", "age": 5, "color": [{"code": "brown"}]},
            {"type": "pig", "name": "Poe", "age": 6, "color": [{"code": "black"}]}
            ]}'''
        expected_ = '{"animals": [{"type": "pig", "name": "Poe", "age": 6, "color": [{"code": "black"}]}, {"type": "dog", "name": "Coe", "age": 5, "color": [{"code": "brown"}]}, {"type": "cat", "name": "Doe", "age": 7, "color": [{"code": "white"}]}]}'
        self.assertEqual(jsonsort.animaux(test_json, sort_by='type', reverse=True), expected_)


if __name__ == '__main__':
    unittest.main()