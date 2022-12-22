package jcp17.enumerados;

enum Type { // cannot have abstract modifier
	GOOD {
		String describe() {
			return "Good";
		}
	},
	BAD {
		String describe() {
			return "Not good";
		}
	};

	// this is valid provided all the above objects implement
	// the method
	abstract String describe();
}