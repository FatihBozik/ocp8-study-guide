# -*- coding: utf-8 -*- #
# frozen_string_literal: true

require 'rouge' unless defined? ::Rouge.version

module Rouge
  module Themes
    class GithubLight < CSSTheme
      name 'github_light'

      style Comment::Multiline,               :fg => '#6a737d', :italic => false
      style Comment::Preproc,                 :fg => '#999999', :bold => false
      style Comment::Single,                  :fg => '#6a737d', :italic => false
      style Comment::Special,                 :fg => '#999999', :italic => false, :bold => false
      style Comment,                          :fg => '#999988', :italic => false
      style Error,                            :fg => '#a61717', :bg => '#e3d2d2'
      style Generic::Deleted,                 :fg => '#000000', :bg => '#ffdddd'
      style Generic::Emph,                    :fg => '#000000', :italic => false
      style Generic::Error,                   :fg => '#aa0000'
      style Generic::Heading,                 :fg => '#999999'
      style Generic::Inserted,                :fg => '#000000', :bg => '#ddffdd'
      style Generic::Output,                  :fg => '#888888'
      style Generic::Prompt,                  :fg => '#555555'
      style Generic::Strong,                  :bold => true
      style Generic::Subheading,              :fg => '#aaaaaa'
      style Generic::Traceback,               :fg => '#aa0000'
      style Keyword::Constant,                :fg => '#005cc5', :bold => false
      style Keyword::Declaration,             :fg => '#d73a49', :bold => false
      style Keyword::Namespace,               :fg => '#d73a49', :bold => false
      style Keyword::Pseudo,                  :fg => '#d73a49', :bold => false
      style Keyword::Reserved,                :fg => '#d73a49', :bold => false
      style Keyword::Type,                    :fg => '#d73a49', :bold => false
      style Keyword,                          :fg => '#d73a49', :bold => false
      style Literal::Number::Float,           :fg => '#005cc5'
      style Literal::Number::Hex,             :fg => '#005cc5'
      style Literal::Number::Integer::Long,   :fg => '#005cc5'
      style Literal::Number::Integer,         :fg => '#005cc5'
      style Literal::Number::Oct,             :fg => '#005cc5'
      style Literal::Number,                  :fg => '#005cc5'
      style Literal::String::Backtick,        :fg => '#032f62'
      style Literal::String::Char,            :fg => '#032f62'
      style Literal::String::Doc,             :fg => '#032f62'
      style Literal::String::Double,          :fg => '#032f62'
      style Literal::String::Escape,          :fg => '#032f62'
      style Literal::String::Heredoc,         :fg => '#032f62'
      style Literal::String::Interpol,        :fg => '#032f62'
      style Literal::String::Other,           :fg => '#032f62'
      style Literal::String::Regex,           :fg => '#032f62'
      style Literal::String::Single,          :fg => '#032f62'
      style Literal::String::Symbol,          :fg => '#005cc5'
      style Literal::String,                  :fg => '#032f62'
      style Name::Attribute,                  :fg => '#000000'
      style Name::Builtin::Pseudo,            :fg => '#999999'
      style Name::Builtin,                    :fg => '#d73a49'
      style Name::Class,                      :fg => '#000000', :bold => false
      style Name::Constant,                   :fg => '#000000'
      style Name::Decorator,                  :fg => '#d73a49', :bold => false
      style Name::Entity,                     :fg => '#6f42c1'
      style Name::Exception,                  :fg => '#990000', :bold => true
      style Name::Function,                   :fg => '#6f42c1', :bold => false
      style Name::Label,                      :fg => '#000000'
      style Name::Namespace,                  :fg => '#000000'
      style Name::Tag,                        :fg => '#000000'
      style Name::Variable::Class,            :fg => '#000000'
      style Name::Variable::Global,           :fg => '#000000'
      style Name::Variable::Instance,         :fg => '#000000'
      style Name::Variable,                   :fg => '#000000'
      style Operator::Word,                   :fg => '#d73a49', :bold => true
      style Operator,                         :fg => '#000000', :bold => false
      style Text::Whitespace,                 :fg => '#bbbbbb'
      style Text,                             :bg => '#ffffff'
    end
  end
end
