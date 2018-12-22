default:
	@echo 'Usage:'
	@echo '  make <target>'
	@echo ''
	@echo 'Targets:'
	@echo '  run      Run the hello application.'
	@echo '  build    Build the hello application.'
	@echo '  clean    Remove objects and binaries.'

run: build
	@java -jar hello.jar

build: hello.jar

hello.jar: hello.kt
	kotlinc hello.kt -include-runtime -d hello.jar

clean:
	-rm -f hello.jar
