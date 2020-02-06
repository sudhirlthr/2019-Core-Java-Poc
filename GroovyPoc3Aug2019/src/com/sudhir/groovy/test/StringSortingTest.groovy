package com.sudhir.groovy.test

import spock.lang.Specification

class StringSortingTest extends Specification{
	StringSortingTest st = new StringSortingTest();
	def strings= [
		'this',
		'is',
		'a',
		'list',
		'of',
		'strings'
	];

	def "when sort is lexicographical"() {
		when:
		st.sortlexicographically strings
		then:
		strings ==  [
			'a',
			'is',
			'list',
			'of',
			'strings',
			'this'
		];
	}
	def "when sort is by length"() {
		when:
		sorter.sortByDecreasingLength strings
		then:
		strings*.size() == [7, 4, 4, 2, 2, 1]
	}
}
