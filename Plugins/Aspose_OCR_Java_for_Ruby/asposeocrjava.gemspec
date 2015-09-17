# coding: utf-8
lib = File.expand_path('../lib', __FILE__)
$LOAD_PATH.unshift(lib) unless $LOAD_PATH.include?(lib)
require 'asposeocrjava/version'

Gem::Specification.new do |spec|
  spec.name          = 'asposeocrjava'
  spec.version       = Asposeocrjava::VERSION
  spec.authors       = ['Aspose Marketplace']
  spec.email         = ['marketplace@aspose.com']
  spec.summary       = %q{A Ruby gem to work with Aspose.OCR for Java libraries}
  spec.description   = %q{AsposeOcrJava is a Ruby gem that helps working with optical character & marker recognition documents using Aspose.OCR for Java libraries}
  spec.homepage      = 'https://github.com/asposeocr/Aspose_OCR_Java/tree/master/Plugins/Aspose_OCR_Java_for_Ruby'
  spec.license       = 'MIT'

spec.files         = `git ls-files`.split($/)
  spec.executables   = spec.files.grep(%r{^bin/}) { |f| File.basename(f) }
  spec.test_files    = spec.files.grep(%r{^(test|spec|features)/})
spec.require_paths = ['lib']

  spec.add_development_dependency 'bundler', '~> 1.7'
  spec.add_development_dependency 'rake', '~> 10.0'
  spec.add_development_dependency 'rspec'

  spec.add_dependency 'rjb', '~> 1.5.2'

end
