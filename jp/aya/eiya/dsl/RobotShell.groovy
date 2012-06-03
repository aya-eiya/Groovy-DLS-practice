Binding binding = new Binding([
                  robot:new Robot(),
                  *:Direction.values()
                                .collectEntries{
                                  [(it.name()):it]
                                }
                  ])
GroovyShell shell = new GroovyShell(binding)
shell.evaluate(new File("RobotScript.groovy"))