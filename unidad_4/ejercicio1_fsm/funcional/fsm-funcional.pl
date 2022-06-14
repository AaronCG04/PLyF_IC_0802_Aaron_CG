%un evento X genera la transición del estado Y al estado Z
transicion(00,gonorte,gonorte).
transicion(01,gonorte,waitnorte).
transicion(10,gonorte,gonorte).
transicion(11,gonorte,waitnorte).

transicion(00,waitnorte,goeste).
transicion(01,waitnorte,goeste).
transicion(10,waitnorte,goeste).
transicion(11,waitnorte,goeste).

transicion(00,goeste,goeste).
transicion(01,goeste,goeste).
transicion(10,goeste,waiteste).
transicion(11,goeste,waiteste).

transicion(00,waiteste,gonorte).
transicion(01,waiteste,gonorte).
transicion(10,waiteste,gonorte).
transicion(11,waiteste,gonorte).

%borrar(N,[Z|L],[Z|L]):- N1 is N-1,borrar(N1,L,L).
%insertar(E,L,[E,L]).
%insertar(E,[X|Y],[X|Z]):- insertar(E,Y,Z).
%eventos(Ei,borrar[1,],inseventos()
%
%regla para obtener los estados generados de manera recusiva
eventos(Ei,[I|F]):- transicion(I,Ei,Z),write(Z),nl,eventos(Z,F).


