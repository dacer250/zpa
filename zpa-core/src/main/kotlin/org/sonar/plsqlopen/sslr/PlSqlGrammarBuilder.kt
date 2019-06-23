/**
 * Z PL/SQL Analyzer
 * Copyright (C) 2015-2019 Felipe Zorzo
 * mailto:felipebzorzo AT gmail DOT com
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package org.sonar.plsqlopen.sslr

import com.sonar.sslr.api.Grammar
import com.sonar.sslr.api.TokenType
import org.sonar.sslr.grammar.GrammarRuleBuilder
import org.sonar.sslr.grammar.GrammarRuleKey
import org.sonar.sslr.grammar.LexerfulGrammarBuilder

class PlSqlGrammarBuilder(private val builder: LexerfulGrammarBuilder) {

    fun build(): Grammar = builder.build()

    fun rule(ruleKey: GrammarRuleKey): GrammarRuleBuilder = builder.rule(ruleKey)

    fun setRootRule(ruleKey: GrammarRuleKey) {
        builder.setRootRule(ruleKey)
    }

    fun sequence(e1: Any, e2: Any): Any = builder.sequence(e1, e2)

    fun sequence(e1: Any, e2: Any, vararg rest: Any): Any = builder.sequence(e1, e2, *rest)

    fun firstOf(e1: Any, e2: Any): Any = builder.firstOf(e1, e2)

    fun firstOf(e1: Any, e2: Any, vararg rest: Any): Any = builder.firstOf(e1, e2, *rest)

    fun optional(e: Any): Any = builder.optional(e)

    fun optional(e1: Any, vararg rest: Any): Any = builder.optional(e1, *rest)

    fun oneOrMore(e: Any): Any = builder.oneOrMore(e)

    fun oneOrMore(e1: Any, vararg rest: Any): Any = builder.oneOrMore(e1, *rest)

    fun zeroOrMore(e: Any): Any = builder.zeroOrMore(e)

    fun zeroOrMore(e1: Any, vararg rest: Any): Any = builder.zeroOrMore(e1, *rest)

    fun next(e: Any): Any = builder.next(e)

    fun next(e1: Any, vararg rest: Any): Any = builder.next(e1, *rest)

    fun nextNot(e: Any): Any = builder.nextNot(e)

    fun nextNot(e1: Any, vararg rest: Any): Any = builder.nextNot(e1, *rest)

    fun nothing(): Any = builder.nothing()

    fun buildWithMemoizationOfMatchesForAllRules(): Grammar = builder.buildWithMemoizationOfMatchesForAllRules()

    fun adjacent(e: Any): Any = builder.adjacent(e)

    fun anyTokenButNot(e: Any): Any = builder.anyTokenButNot(e)

    fun isOneOfThem(t1: TokenType, vararg rest: TokenType): Any = builder.isOneOfThem(t1, *rest)

    fun bridge(from: TokenType, to: TokenType): Any = builder.bridge(from, to)

    fun anyToken(): Any = builder.anyToken()

    fun tillNewLine(): Any = builder.tillNewLine()

    fun till(e: Any): Any = builder.till(e)

    fun exclusiveTill(e: Any): Any = builder.exclusiveTill(e)

    fun exclusiveTill(e1: Any, vararg rest: Any): Any = builder.exclusiveTill(e1, *rest)

}
