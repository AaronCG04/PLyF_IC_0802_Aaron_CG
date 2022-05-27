%estableciendo relacion X persona padece Y enfermedad
padece(jhon, gripe).
	padece(jhon, hepatitis).
padece(ana, gripe).
padece(carlos, alergia).

%ralacion X es sintoma de Y enfermedad
es-sintoma(fiebre, gripe).
es-sintoma(cansancio, gripe).
es-sintoma(estornudos, alergia).

%relacion: X farmaco suprime Y sintoma
suprime(paracetamol, fiebre).
suprime(antihistaminico, estornudos).

%regla para identificar que X farmaco alivia Y enfermedad
alivia(Far, Enf) :- es-sintoma(Sin, Enf), suprime(Far, Sin).
%regla: persona X debe tomar Y farmaco, tomando encuenta que 
%enfermedad padece y que farmaco alivia dicho sintoma
debe_tomar(Per, Far) :- padece(Per, Enf), alivia(Far, Enf).

padece_pe(Sin,Per):-es-sintoma(Sin,gripe),padece(Per,gripe).