package fr.univartois.butinfo.fractals.image;

import java.awt.image.BufferedImage;

import fr.univartois.butinfo.fractals.color.ColorPalette;
import fr.univartois.butinfo.fractals.sequences.Sequence;

/**
 * Builder de l'image de la fractale.
 * 
 * @author Sébastien Coze
 * @version 0.1.0
 *
 */
public class FractalImageBuilder {

	/**
	 * Hauteur de l'image en pixels.
	 */
	private int height;

	/**
	 * Largeur de l'image en pixels.
	 */
	private int width;

	/**
	 * Échelle de l'image. Elle correspond à la largeur d'un pixel dans le plan
	 * complexe.
	 */
	private int scale;

	/**
	 * Point central de l'image.
	 */
	private Pixel centralPoint;

	/**
	 * Suite étant l'approche permettant de générer la fractale (suite complexe ou
	 * chaotique).
	 */
	private Sequence sequence;

	/**
	 * Palette de couleurs utilisé par l'image.
	 */
	private ColorPalette colorPalette;

	/**
	 * Nom du fichier dans lequel le résultat sera sauvegardé.
	 */
	private String file;

	/**
	 * Crée une instance de {@link FractalImageBuilder}.
	 */
	private FractalImageBuilder() {
	}

	/**
	 * Crée une instance de {@link FractalImageBuilder}.
	 * 
	 * @return Une instance de {@link FractalImageBuilder}.
	 */
	public static FractalImageBuilder newInstance() {
		return new FractalImageBuilder();
	}

	/**
	 * Donne l'hauteur de l'image.
	 * 
	 * @return L'hauteur de l'image.
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * Ajoute une hauteur au {@link FractalImageBuilder}.
	 * 
	 * @param height L'hauteur de l'image.
	 * @return Le builder avec ce paramètre.
	 */
	public FractalImageBuilder withHeight(int height) {
		this.height = height;
		return this;
	}

	/**
	 * Donne la largeur de l'image.
	 * 
	 * @return La largeur de l'image.
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * Ajoute une largeur au {@link FractalImageBuilder}.
	 * 
	 * @param width L'hauteur de l'image.
	 * @return Le builder avec ce paramètre.
	 */
	public FractalImageBuilder withWidth(int width) {
		this.width = width;
		return this;
	}

	/**
	 * Donne l'échelle de l'image.
	 * 
	 * @return L'échelle de l'image.
	 */
	public int getScale() {
		return scale;
	}

	/**
	 * Ajoute une échelle au {@link FractalImageBuilder}.
	 * 
	 * @param scale L'échelle de l'image.
	 * @return Le builder avec ce paramètre.
	 */
	public FractalImageBuilder withScale(int scale) {
		this.scale = scale;
		return this;
	}

	/**
	 * Donne le point central de l'image.
	 * 
	 * @return Le point central de l'image.
	 */
	public Pixel getCentralPoint() {
		return centralPoint;
	}

	/**
	 * Ajoute un point central au {@link FractalImageBuilder}.
	 * 
	 * @param centralPoint Le point central de l'image.
	 * @return Le builder avec ce paramètre.
	 */
	public FractalImageBuilder withCentralPoint(Pixel centralPoint) {
		this.centralPoint = centralPoint;
		return this;
	}

	/**
	 * Donne la suite de l'image.
	 * 
	 * @return La suite de l'image.
	 */
	public Sequence getSequence() {
		return sequence;
	}

	/**
	 * Ajoute une suite au {@link FractalImageBuilder}.
	 * 
	 * @param sequence La suite utilisée pour la génération de l'image.
	 * @return Le builder avec ce paramètre.
	 */
	public FractalImageBuilder withSequence(Sequence sequence) {
		this.sequence = sequence;
		return this;
	}

	/**
	 * Donne la palette de couleur.
	 * 
	 * @return La palette de couleur.
	 */
	public ColorPalette getColorPalette() {
		return colorPalette;
	}

	/**
	 * Ajoute une palette de couleurs au {@link FractalImageBuilder}.
	 * 
	 * @param sequence La palette de couleur utilisée pour la génération de l'image.
	 * @return Le builder avec ce paramètre.
	 */
	public FractalImageBuilder withColorPalette(ColorPalette colorPalette) {
		this.colorPalette = colorPalette;
		return this;
	}

	/**
	 * Donne le fichier de l'image.
	 * 
	 * @return Le fichier de l'image.
	 */
	public String getFile() {
		return file;
	}

	/**
	 * Ajoute un fichier de sauvegarde au {@link FractalImageBuilder}. L'ancien,
	 * s'il existe, est supprimé.
	 * 
	 * @param file Le fichier de sauverge.
	 * @return Le builder avec ce paramètre.
	 */
	public FractalImageBuilder withFile(String file) {
		this.file = file;
		return this;
	}

	/**
	 * Construire une image fractale.
	 * 
	 * @return L'image fractale.
	 */
	public FractalImage build() {
		return new FractalImage(this);
	}

}
