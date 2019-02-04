# Savez-vous (vraiment) utiliser Git ?

Ici, vous trouverez les commandes utilisées lors de la démonstration "live".

## Analyse

### Connaître l'état du dossier de travail

`git status`

### Voir un commit

`git show <a-commit>`

### Voir les différences avec le dernier commit

`git diff`

### Voir les différences entre l'index et le dernier commit

`git diff --staged`

## Index

### Retirer de l'index

`git reset -- <a-file>`

### Ajouter à l'index en mode "patch"

`git add -p`

## Commit

### Défaire le dernier commit

`git reset --soft HEAD~1`

### Modifier le commit précédent

`git commit --amend`

### Ré-arranger votre historique depuis un commit donné

`git rebase -i <a-commit>~1`

### "Supprimer" les commits depuis un commit donné

`git reset --hard <a-commit>`

### Lister les dernières actions même les commits "supprimés"

`git reflog`

ou

`git log -g`

### Comment récupérer juste un commit ?

`git cherry-pick <a-commit>`

### Annuler un commit ?

`git revert <a-commit>`
