// read strings split by spaces until end of file
string str;
while (cin >> str) {
	... do stuff ...
}

// read lines from stdin until end of file
string line;
while (getline(cin, line)) {
	... do stuff ...
}


--- FUNCTIONS ---

// split string by space
#include <sstream>
#include <string>
#include <vector>
vector<string> split (string &str) {
	stringstream ss(str);
	string word;
	vector<string> tokens;
	while (ss >> word)
		tokens.push_back(word);
	return tokens;
}

// string to int
#include <cstdlib>
#include <string>
int toInt(string str) {
	return atoi(str.c_str());
}

// string to number: int, long, double...
#include <sstream>
#include <string>
float toFloat(string str) {
	istringstream buffer(str);
	float value;
	buffer >> value;
	return value;
}

// get digits
#include <vector>
vector<int> getDigits (int n) {
	vector<int> digits;
	while (n > 0) {
		digits.push_back(n%10);	// get least sig digit
		n /= 10;		// shift all digits right
	}
	return digits;
}

// assemble digits into number
#include <vector>
int number(vector<int> digits) {
	int n = 0;
	int ten = 1;
	for (int i = 0; i < digits.size(); i++) {
		n += digits[i]*ten;
		ten *= 10;
	}
	return n;
}
